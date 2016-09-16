// JAPAN FLAG: HARD CODED
void japan() {
  
  // SETUP
  rectMode( CENTER );
  
  // FLAG BORDER
  fill( 255 );
  stroke(0);
  rect( width/2, height/2, 300, 200 );
  
  // RED CENTER
  noStroke();
  fill( 255, 0, 0 );
  ellipse( width/2, height/2, 100, 100 );
  
}