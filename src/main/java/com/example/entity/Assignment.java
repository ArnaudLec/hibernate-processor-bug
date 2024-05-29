package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "assignment")
public class Assignment extends AbstractEntity
{
  private static final long serialVersionUID = 1L;

  private Person person;

  private Organization organization;

  @ManyToOne(fetch = FetchType.LAZY)
  public Person getPerson()
  {
    return person;
  }

  public void setPerson(final Person person)
  {
    this.person = person;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  public Organization getOrganization()
  {
    return organization;
  }

  public void setOrganization(final Organization organization)
  {
    this.organization = organization;
  }

}
