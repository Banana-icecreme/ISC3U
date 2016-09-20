// Japan FLAG: HARD CODED
void japan() {
  
  // SETUP
  rectMode( CENTER );
  
  // FLAG BORDER
  fill( 255 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // RED CENTER
  noStroke();
  fill( 255, 0, 0 );
  ellipse( xFlagCenter, yFlagCenter, FLAG_SIZE / 2, FLAG_SIZE / 2 );

}