// mauritania FLAG: HARD CODED
void mauritania() {
  
  // SETUP
  rectMode( CENTER );
  
  // FLAG BORDER
  fill( 0, 255, 0 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  //moon
  fill(200,200,0);
  stroke(0);
  ellipse(xFlagCenter, yFlagCenter, 1/3*FLAG_FACTOR_WIDTH* FLAG_SIZE, 1/2*FLAG_FACTOR_HEIGHT * FLAG_SIZE);
  fill(0,255,0);
  ellipse(xFlagCenter+5, yFlagCenter+5, 1/3*FLAG_FACTOR_WIDTH* FLAG_SIZE, 1/2*FLAG_FACTOR_HEIGHT * FLAG_SIZE);
}