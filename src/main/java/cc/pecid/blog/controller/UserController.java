package cc.pecid.blog.controller;

import cc.pecid.blog.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/user")
@Slf4j
@Validated
public class UserController {

    @GetMapping
    public void info(@NotNull @Max(100) Integer id) {
        log.info(id.toString());
    }

    @PostMapping("/add")
    public void add(@RequestBody @Validated User user) {
        log.info("/user/add -----" + user);
    }

//    @ExceptionHandler
//    public String exceptionHandler(Exception e) {
//        return e.getMessage();
//    }

}
