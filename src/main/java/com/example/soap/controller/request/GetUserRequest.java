package com.example.soap.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="user", propOrder = {"name"})
@XmlRootElement(name="getUserRequest")
public class GetUserRequest {

    @XmlElement(required = true)
    private String name;

}
