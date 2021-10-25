package com.example.soap.response;


import com.example.soap.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder = {"user"})  // we say user to return user
// we leave "" because we are not using any function, we use object itself
@XmlRootElement(name="getUserResponse")
public class GetUserResponse {

    @XmlElement(required = true)
    private User user;
}
