package com.gb.tsm0.dto;

public class TailDto {
    public Long id;
    private String owner;
    private String tailColor;
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

    public String getTailColor() {
        return tailColor;
    }

    public void setTailColor(String tailColor) {
        this.tailColor = tailColor;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public TailDto(long id, String owner, String tailColor, String tailLength) {
        this.id = id;
        this.owner = owner;
        this.tailColor = tailColor;
        this.tailLength = tailLength;
    }

    public TailDto() {
    }
}
