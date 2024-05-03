package poo.tp.app.dto.movies;

public class MovieDto {
  private String ID;
  private String name;
  private String synopsis;
  private float ticketsQty;
  private float ticketPrice;
  private int durationInMinutes;
  private String classification;
  private String genre;
  private String exhibitionStartDate;
  private String exhibitionEndDate;

  public MovieDto(String ID, String name, String synopsis, float ticketsQty, float ticketPrice, int durationInMinutes,
      String classification, String genre, String exhibitionStartDate, String exhibitionEndDate) {
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

  public String getID() {
    return ID;
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

  public String getClassification() {
    return classification;
  }

  public String getGenre() {
    return genre;
  }

  public String getExhibitionStartDate() {
    return exhibitionStartDate;
  }

  public String getExhibitionEndDate() {
    return exhibitionEndDate;
  }
}
