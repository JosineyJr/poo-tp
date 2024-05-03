package poo.tp.domain.model.movies;

import java.util.Date;

public class DisplayTime {
  private Date start;
  private Date end;

  public DisplayTime(Date start, Date end) {
    this.start = start;
    this.end = end;
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  @Override
  public String toString() {
    return "DisplayTime{" +
            "start=" + start +
            ", end=" + end +
            '}';
  }
}
