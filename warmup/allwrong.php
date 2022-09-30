
function getWrongAnswers(int $N, string $C): string {
  $answ = "";
  for($i=0; $i<$N; $i++){
    if($C[$i] == "A") $answ .= "B";
    if($C[$i] == "B") $answ .="A";
  }
  return $answ;
}
