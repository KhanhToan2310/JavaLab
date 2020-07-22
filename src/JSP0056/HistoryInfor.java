/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0056;

/**
 *
 * @author PHONG VU
 */
public class HistoryInfor extends Worker implements Comparable<HistoryInfor> {

    public String comment;
    public String date;

    public HistoryInfor() {
    }

    public HistoryInfor(String id, String name, int age, int salary, String WorkLocation, String comment, String date) {
        super(id, name, age, salary, WorkLocation);
        this.comment = comment;
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%-4s %-10s", comment, date);
    }

    @Override
    public int compareTo(HistoryInfor o) {
        return this.getId().compareTo(o.getId());
    }

}
