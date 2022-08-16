package com.elasticsearch.search.entity;



import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "user")
@Getter
@Setter
@Builder
public class User implements Serializable {
    @Id
    private Long id;
    private String username;
    private String password;
    private String address;
    private String email;
}
