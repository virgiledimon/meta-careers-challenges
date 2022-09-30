
function getHitProbability(int $R, int $C, array $G): float {
  $batt = 0;
  for($i=0; $i<$R; $i++){
    for($j=0; $j<$C; $j++){
      if($G[$i][$j] == 1){
        $batt ++;
      }
    }
  }
  
  return $batt/($R*$C);
}
