package com.example.demo;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RedisTemplate<String, Object> redisTemplate;

    public UserService(UserRepository userRepository,
                       RedisTemplate<String, Object> redisTemplate) {
        this.userRepository = userRepository;
        this.redisTemplate = redisTemplate;
    }

    public User getById(Long id) {
        Object cached = redisTemplate.opsForValue().get("user:" + id);
        if (cached != null) {
            return (User) cached;
        }

        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            redisTemplate.opsForValue().set("user:" + id, user);
        }
        return user;
    }

	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
