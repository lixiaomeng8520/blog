package cc.pecid.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private Integer id;
    private String name;

    @Max(value = 200, message = "max 200")
    private Integer age;

//    private Article article;
    
}
