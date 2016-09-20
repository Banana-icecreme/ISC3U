// mauritania FLAG: HARD CODED
void mauritania() {
  
  // SETUP
  rectMode( CENTER );
  
  // FLAG BORDER
  fill( 18, 104,47  );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  //moon
  fill(400,200,0);
  stroke(0,0,0,0);
  ellipse(xFlagCenter, yFlagCenter, FLAG_FACTOR_HEIGHT* FLAG_SIZE/3*2, FLAG_FACTOR_HEIGHT * FLAG_SIZE/3*2);
  fill(18, 104,47 );
  stroke(18, 104,47 );
  ellipse(xFlagCenter, yFlagCenter-FLAG_FACTOR_HEIGHT* FLAG_SIZE/6, FLAG_FACTOR_HEIGHT* FLAG_SIZE/3*2, FLAG_FACTOR_HEIGHT * FLAG_SIZE/3*2);
  
  // STAR SHAPE
  fill(400,200,0);
  stroke(0);
  star(xFlagCenter, yFlagCenter- FLAG_FACTOR_HEIGHT * FLAG_SIZE/4, 70, 30, 5);
}

//4