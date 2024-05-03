package poo.tp.domain.model.movies;

public class Movie {
  private String ID;
  private String name;
  private String synopsis;
  private float ticketsQty;
  private float ticketPrice;
  private int durationInMinutes;
  private Classification classification;
  private Genre genre;
  private DisplayTime displayTime;

  public Movie(String ID, String name, String synopsis, float ticketsQty, float ticketPrice, int durationInMinutes, Classification classification, Genre genre) {
    this.ID = ID;
    this.name = name;
    this.synopsis = synopsis;
    this.ticketsQty = ticketsQty;
    this.ticketPrice = ticketPrice;
    this.durationInMinutes = durationInMinutes;
    this.classification = classification;
    this.genre = genre;
  }

  public Movie(String name, String synopsis, float ticketsQty, float ticketPrice, int durationInMinutes, Classification classification, Genre genre) {
    this.name = name;
    this.synopsis = synopsis;
    this.ticketsQty = ticketsQty;
    this.ticketPrice = ticketPrice;
    this.durationInMinutes = durationInMinutes;
    this.classification = classification;
    this.genre = genre;
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

  public DisplayTime getDisplayTime() {
    return displayTime;
  }

  public void setDisplayTime(DisplayTime displayTime) {
    this.displayTime = displayTime;
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
            ", classification=" + classification +
            ", genre=" + genre +
            '}';
  }
}
