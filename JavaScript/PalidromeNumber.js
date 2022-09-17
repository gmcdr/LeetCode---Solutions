var isPalindrome = function (x) {
  const vect = String(x)
    .split("")
    .map((x) => {
      return Number(x);
    });
  let vect_reverse = [];
  let lengths = vect.length - 1;

  for (let index = lengths; index > -1; index--) {
    vect_reverse.push(vect[index]);
  }

  let check = false;
  for (var i = 0; i < vect.length; i++) {
    if (vect[i] === vect_reverse[i]) {
      check = true;
    } else {      
      check = false;
      break;
    }
  }
  return check;
};

console.log(isPalindrome(1000021));
