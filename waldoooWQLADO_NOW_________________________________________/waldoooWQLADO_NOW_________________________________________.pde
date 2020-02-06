void setup() {
  PImage yes = loadImage("yes.jpg"); // Change this to match your file name.
  size(500, 500);
  image(yes, 75,125);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
  PImage waldo = loadImage("waldo.png");
  image(waldo, 75, 125);
 
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
print("X: "+ mouseX + " Y: " +mouseY +" " );
      // If the mouse is on Waldo, print “Waldo found!”
      int y = mouseX;
      int x = mouseY;
if(mouseX>176){
x =176;
}
if(mouseX<249){
 x=249; 
}
if(mouseY>128){
 y=128; 
}
if(mouseY<211){
  y=211;
}
if(y==211){
 print(" ZA WARUDO! ");
 playWoohoo();
}
if(y==128){
 print(""); 
}
if(x==249){
 print(" *time stops* "); 
 playWoohoo();
}
if(x==176){
 print(""); 
}
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
