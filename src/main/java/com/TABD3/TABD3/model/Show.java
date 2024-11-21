package com.TABD3.TABD3.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "shows")
public class Show {

    @Id
    @Field("show_id")
    private String showId;

    private String location;
    private String date;

    @Field("available_tickets")
    private int availableTickets;

    public Show() {}

    public Show(String location, String date, int availableTickets) {
        this.location = location;
        this.date = date;
        this.availableTickets = availableTickets;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    @Override
    public String toString() {
        return "Show{" +
                "showId=" + showId +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", availableTickets=" + availableTickets +
                '}';
    }
}
