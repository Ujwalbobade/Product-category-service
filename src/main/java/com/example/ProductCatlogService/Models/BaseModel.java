package com.example.ProductCatlogService.Models;

import java.util.Date;

public abstract class BaseModel {

    private Long id;
    private Date CreatedAt;

    private Date ModifiedAt;

    private Status status;
}
