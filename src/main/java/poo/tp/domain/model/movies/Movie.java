package poo.tp.domain.model.movies;

import java.util.Date;
import java.util.UUID;

public class Movie {
  private String ID;
  private String name;
  private String synopsis;
  private float ticketsQty;
  private float ticketPrice;
  private int durationInMinutes;
  private Classification classification;
  private Genre genre;
  private Date exhibitionStartDate;
  private Date exhibitionEndDate;

  public Movie(String ID, String name, String synopsis, float ticketsQty, float ticketPrice, int durationInMinutes,
      Classification classification, Genre genre, Date exhibitionStartDate, Date exhibitionEndDate) {
    this.ID = ID;
    this.name = name;
    this.synopsis = synopsis;
    this.ticketsQty = ticketsQty;
    this.ticketPrice = ticketPrice;
    this.durationInMinutes = durationInMinutes;
    this.classification = classification;
    this.genre = genre;
    this.exhibitionStartDate = exhibitionStartDate;
    this.exhibitionEndDate = exhibitionEndDate;
  }

  public Movie(String name, String synopsis, float ticketsQty, float ticketPrice, int durationInMinutes,
      Classification classification, Genre genre, Date exhibitionStartDate, Date exhibitionEndDate) {
    this.name = name;
    this.synopsis = synopsis;
    this.ticketsQty = ticketsQty;
    this.ticketPrice = ticketPrice;
    this.durationInMinutes = durationInMinutes;
    this.classification = classification;
    this.genre = genre;
    this.exhibitionStartDate = exhibitionStartDate;
    this.exhibitionEndDate = exhibitionEndDate;

    this.ID = UUID.randomUUID().toString();
  }

  public String getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public float getTicketsQty() {
    return ticketsQty;
  }

  public void setTicketsQty(float ticketsQty) {
    this.ticketsQty = ticketsQty;
  }

  public float getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(float ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public int getDurationInMinutes() {
    return durationInMinutes;
  }

  public void setDurationInMinutes(int durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
  }

  public Classification getClassification() {
    return classification;
  }

  public void setClassification(Classification classification) {
    this.classification = classification;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public Date getExhibitionStartDate() {
    return exhibitionStartDate;
  }

  public void setExhibitionStartDate(Date exhibitionStartDate) {
    this.exhibitionStartDate = exhibitionStartDate;
  }

  public Date getExhibitionEndDate() {
    return exhibitionEndDate;
  }

  public void setExhibitionEndDate(Date exhibitionEndDate) {
    this.exhibitionEndDate = exhibitionEndDate;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "ID='" + ID + '\'' +
        ", name='" + name + '\'' +
        ", synopsis='" + synopsis + '\'' +
        ", ticketsQty=" + ticketsQty +
        ", ticketPrice=" + ticketPrice +
        ", durationInMinutes=" + durationInMinutes +
        ", classification=" + classification.getName() +
        ", genre=" + genre.getName() +
        ", exhibitionStartDate=" + exhibitionStartDate +
        ", exhibitionEndDate=" + exhibitionEndDate +
        '}';
  }
}
