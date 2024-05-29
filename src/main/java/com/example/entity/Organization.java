package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization extends AbstractEntity
{
  private static final long serialVersionUID = 1L;

  private List<Assignment> assignments = new ArrayList<>(0);

  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, orphanRemoval = true)
  public List<Assignment> getAssignments()
  {
    return assignments;
  }

  public void setAssignments(final List<Assignment> assignments)
  {
    this.assignments = assignments;
  }
}
