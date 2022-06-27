package com.gb.tsm0.dto;

public class TailDto {
    public Long id;
    private String owner;
    private String tailColour;
    private String tailLength;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTailColour() {
        return tailColour;
    }

    public void setTailColour(String tailColour) {
        this.tailColour = tailColour;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public TailDto(long id, String owner, String tailColour, String tailLength) {
        this.id = id;
        this.owner = owner;
        this.tailColour = tailColour;
        this.tailLength = tailLength;
    }

    public TailDto() {
    }
}
