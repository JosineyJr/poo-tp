package poo.tp.app.dto.movies;

import java.util.Date;

import poo.tp.domain.model.movies.Classification;
import poo.tp.domain.model.movies.Genre;

public class CreateMovieDto {
  private String name;
  private String synopsis;
  private float ticketsQty;
  private float ticketPrice;
  private int durationInMinutes;
  private Classification classification;
  private Genre genre;
  private Date exhibitionStartDate;
  private Date exhibitionEndDate;

  public CreateMovieDto(String name, String synopsis, float ticketsQty, float ticketPrice, int durationInMinutes,
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
  }

  public String getName() {
    return name;
  }

  public String getSynopsis() {
    return synopsis;
  }

  public float getTicketsQty() {
    return ticketsQty;
  }

  public float getTicketPrice() {
    return ticketPrice;
  }

  public int getDurationInMinutes() {
    return durationInMinutes;
  }

  public Classification getClassification() {
    return classification;
  }

  public Genre getGenre() {
    return genre;
  }

  public Date getExhibitionStartDate() {
    return exhibitionStartDate;
  }

  public Date getExhibitionEndDate() {
    return exhibitionEndDate;
  }
}
