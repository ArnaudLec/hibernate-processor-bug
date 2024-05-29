package com.example.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  private UUID id;

  @Id
  public UUID getId()
  {
    return id;
  }

  public void setId(final UUID id)
  {
    this.id = id;
  }
}
