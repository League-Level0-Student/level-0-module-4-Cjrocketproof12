PImage creeper;
void setup(){
  size(500, 500); //in setup method
   PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(500, 500);          //in setup method
background(minecraft);    
  creeper=loadImage("creeper.png");
  creeper.resize(50, 50); 
  image(creeper, 450, 0);
  
}
void draw(){
  
 if(mousePressed){
  fill(255,0,0);
   ellipse(mouseX,mouseY,25,25); 
 }
  
  
  
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
