package com;

abstract class Item{
private int uid;
private String title;
private int numCopies;
public Item(){
uid =0;
title = " ";
numCopies = 0;
}
public Item(int uid, String title, int numCopies){
this.uid = uid;
this.title = title;
this.numCopies = numCopies;
}
public int getuid() {
	return uid;
}
public void setuid(int uid) {
	this.uid = uid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNumCopies() {
	return numCopies;
}
public void setNumCopies(int numCopies) {
	this.numCopies = numCopies;
}
public void checkIn(){
numCopies = numCopies + 1;
}
public void checkOut(){
numCopies = numCopies - 1;
}
public void addItem(int uid, String str, int n){
setuid(uid);
setTitle(str);
setNumCopies(n);
}
public String toString(){
String str = "ID: " +uid+ " Title: " +title+ " Number of Copies: "+numCopies;
return str;
}
public void print(){
System.out.println("Title: " +title);
System.out.println("ID: " +uid);
System.out.println("Number of copies: " +numCopies);
}
  public boolean equals(Object obj){ 
	  if(obj == null)
		  return false;
		  Item o = (Item) obj;
		  return uid == o.uid && title == o.title&& numCopies==o.numCopies;
  }
 
public void addItem(){
numCopies++;
}
}

abstract class WrittenItem extends Item{
private String author;
public WrittenItem() {
	super();
}
public WrittenItem(int id, String str, int n) {
	super.setuid(id);
	super.setTitle(str);
	super.setNumCopies(n);
}
void setAuthor(String str){
author = str;
}
String getAuthor(){
return author;
}
public int getuid(){
return super.getuid();
}
public String getTitle(){
return super.getTitle();
}
public int getNumCopies(){
return super.getNumCopies();
}

  public boolean equals(Object obj){
	  if(obj == null)
		  return false;
	  WrittenItem wi = (WrittenItem) obj;
	  return super.equals(wi) && author ==wi.author;
  }
 
}


class Book extends WrittenItem{
public Book() {
	super();
}
public Book(int id, String str, String author, int n){
super(id, str, n);
super.setAuthor(author);
}

  public boolean equals(Object obj){
		if(obj == null)
		return false;
		Book otherBook = (Book) obj;
		return super.equals(otherBook);
  }
 
}

class JournalPaper extends WrittenItem{
private int pubYear;
public JournalPaper() {
	super();
}
public JournalPaper(int uid, String str, int n, String author,int y){
super(uid, str, n);
super.setAuthor(author);
pubYear=y;
}
public int yearPub(){
return pubYear;
}
public void print(){
super.print();
System.out.println("Year published: "+ pubYear);
}
}

abstract class MediaItem{
private int runTime;
public int getRunTime() {
	return runTime;
}
public void setRunTime(int runTime) {
	this.runTime = runTime;
}
class Video extends MediaItem{
private String director;
private String genre;
private int year;

public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}
class CD extends MediaItem{
private String artist;
private String genre;
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
}

  public boolean equals(Object obj){
	  if(obj == null)
		  return false;
		  MediaItem mi = (MediaItem) obj;
		  return super.equals(mi) && runTime ==mi.runTime;
  }
 
}

public class Exercise3 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.addItem(101, "One", 4);
		Book b2 = new Book();
		b2.addItem(102, "Two", 5);
		boolean s = b1.equals(b1);
		System.out.println(s);
		b1.setAuthor("Ganesh");
		String s1 = b1.getAuthor();
		System.out.println(s1);
		JournalPaper jp = new JournalPaper();
		b1.print();
	}

}
