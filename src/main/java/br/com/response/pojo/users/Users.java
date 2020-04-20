package br.com.response.pojo.users;


import lombok.*;

@Builder
@Getter @Setter
@NoArgsConstructor
public class Users {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

}
