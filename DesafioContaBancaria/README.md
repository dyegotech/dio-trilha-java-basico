# Domínio do Projeto

Banco oferece 2 tipos de conta:

-> Conta Corrente
-> Conta Poupança

Funcionalidades gerais:

-> Depósito
-> Saque
-> Transferência

Funcionalidades Conta Poupança:

-> Rendimento ao realizar um depósito

Funcionalidades extras:

-> Atributo de cheque especial na conta corrente


saldo : 0

cheque especial: 1.000,00

saldoTotal: 1000

saque 500:

se valor > 0 && valor <= saldototal

se valor <= saldo

saldo = valor;


else 

s1 = saldo - valor // 0 - 500 = -500
s2 = cheque especial -= s1 // 1000 -500 = 500;

deposito: 


-> Atributo de total de rendimento da conta poupança 

Lista de contas do banco