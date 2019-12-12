void setup(){
  
      PImage yes = loadImage("Png.png");
    background(yes);

 size(420,420);
    yes.resize(width,height);


}

void draw(){
  PImage yes = loadImage("Png.png");
    background(yes);
  fill(#ffffff);
  ellipse(202, 125, 20, 20);
  ellipse(234, 125, 20, 20);
  fill(000000);
  

 if(mouseX<270 && mouseX>210){ 
 
   ellipse(mouseX-14, mouseY, 10, 10);
    ellipse(mouseX+14, mouseY, 10, 10);

 }

}
