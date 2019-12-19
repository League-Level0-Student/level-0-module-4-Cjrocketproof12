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
  int y = mouseX;
int x = mouseY;
 if(mouseX<215 ){ 
 y=215;
 }
 if(mouseX>222){
 y=222;
 }
 if(mouseY>130){
  x=130; 
 }
 if(mouseY<120){
  x=120; 
 }
 ellipse(y-15, x, 10, 10);
    ellipse(y+15, x, 10, 10);

}
