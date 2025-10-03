package ie.atu.week3cicd1;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank @Size(min=2, max=10)
    private String productName;
    @Positive
    private double price;
}
