package com.example.soap.model;

import lombok.*;

import javax.xml.bind.annotation.*;

@Data  // instead of @Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="user", propOrder = {"name", "empId", "salary"})
public class User {

    @XmlElement(required = true)  // it's working for the field that we required in request.
    // The name is only mandatory field in our case, that's why it's before name
    private String name;
    private int empId;
    private double salary;
}
