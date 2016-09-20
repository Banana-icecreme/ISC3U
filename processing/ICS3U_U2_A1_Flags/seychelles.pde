// mauritania FLAG: HARD CODED
void seychelles() {
  
  // SETUP
  rectMode( CENTER );
  
  // FLAG BORDER
  fill( 7, 2, 168 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  //yellow part
  fill(255,222,0);
  stroke(0);
  triangle(xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2, xFlagCenter-FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter+FLAG_FACTOR_HEIGHT* FLAG_SIZE/2,
  xFlagCenter+FLAG_FACTOR_WIDTH* FLAG_SIZE/2, yFlagCenter-FLAG_FACTOR_HEIGHT* FLAG_SIZE*2.5);
}

//6