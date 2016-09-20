// Botswana FLAG: HARD CODED
void botswana() {
  
  // SETUP
  rectMode( CENTER );
  
  // BLUE PART OF FLAG
  fill( 119, 169, 218 );
  noStroke();
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // WHITE PART OF FLAG
  fill( 255, 255, 255 );
  noStroke();
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.2
  );
  
  // BLACK PART OF FLAG
  fill( 0, 0, 0 );
  noStroke();
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.18
  );
  
}

//1