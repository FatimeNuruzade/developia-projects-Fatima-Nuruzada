package ecommerce.com.demo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductRequest {

    @NotBlank
    @Size(min = 1, max = 40)
    private String name;

    @Min(0)
    @Max(Integer.MAX_VALUE)
    private Integer price;

    @Min(0)
    @Max(Integer.MAX_VALUE)
    private Integer quantity;
}