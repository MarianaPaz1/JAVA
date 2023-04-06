let nome = document.getElementById("nome");
let sobrenome = document.getElementById("sobrenome");
let email = document.getElementById("email");
let nomeOk = false;
let sNomeOk = false;
let emailOk = false;
let senhaOk = false;

nome.style.color = "grey";

function validaNome() {
  let txt = document.querySelector("#txt");
  if (nome.value.length <= 2) {
    txt.innerHTML = "Nome Inválido";
    txt.style.color = "red";
  } else {
    txt.innerHTML = "Nome válido";
    txt.style.color = "grey";
    nomeOk = true;
  }
}

function validaSnome() {
  let txt1 = document.querySelector("#txt1");
  if (sobrenome.value.length <= 2) {
    txt1.innerHTML = "Sobrenome Inválido";
    txt1.style.color = "red";
  } else {
    txt1.innerHTML = "Sobrenome válido";
    txt1.style.color = "grey";
    sNomeOk = true;
  }
}

function validaEmail() {
  let txt2 = document.querySelector("#txt2");
  if (email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1) {
    txt2.innerHTML = "Email Inválido";
    txt2.style.color = "red";
  } else {
    txt2.innerHTML = "E-mail válido";
    txt2.style.color = "grey";
    emailOk = true;
  }
}

function conferirSenha() {
let txt3 = document.querySelector("#txt3");
let senha = document.querySelector("#senha");
let confere = document.querySelector("#senha2");

  if (confere.value.length == senha.value.length) {
        senhaOk = true;
        console.log(senhaOk);
  }else{
    txt3.innerHTML = "As senhas estão diferentes";
    txt3.style.color = "red";
    console.log(senhaOk);
  }
}

function enviarForm() {
  if (nomeOk == true && sNomeOk == true && emailOk == true && senhaOk == true) {
    alert(
      "Olá " +
        nome.value +
        sobrenome.value +
        " Seja bem vinde ao curso, a partir de agora seu e-mail é: " +
        email.value +
        " e a sua senha de acesso é: **********"
    );
  } else {
    console.log(nomeOk, sNomeOk, emailOk, senhaOk)
    alert("Dados incorretos, por gentileza identificar campos");
  }
}
