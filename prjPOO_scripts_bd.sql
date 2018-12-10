-- Tabelas

create table tb_Instrutor(
	cpf varchar2(11), -- PK
	nome varchar2(50),
	dataNasc varchar2(10),
	endereco varchar2(80),
	numero number(5),
	bairro varchar2(80),
	cidade varchar2(30),
	estado varchar2(20),
	cep varchar2(8),
	telefone varchar2(10),
	celular varchar2(11),
	sexo varchar2(1), -- CHK
	estadoCivil varchar2(15),
	rg varchar2(9),
	email varchar2(80),
	formacao varchar2(80),
	areaAtuacao varchar2(80));
	
create table tb_Aluno(
	cpf varchar2(11), -- PK
	nome varchar2(50),
	dataNasc varchar2(10),
	endereco varchar2(80),
	numero number(5),
	bairro varchar2(80),
	cidade varchar2(30),
	estado varchar2(20),
	cep varchar2(8),
	telefone varchar2(10),
	celular varchar2(11),
	sexo varchar2(1), -- CHK
	estadoCivil varchar2(15),
	rg varchar2(9),
	email varchar2(80),
	escolaridade varchar2(30)); 

create table tb_Curso(
	sigla varchar2(8), -- PK
	nome varchar2(80),
	cargaHoraria number(4),
	valor number(7, 2),
	dataVigencia varchar2(10),
	valorHoraInstrutor number(7, 2),
	programa varchar2(100));
	
create table tb_Turma(
	siglaTurma varchar2(5), -- PK
	descricao varchar2(30),
	dataInicio varchar2(10),
	dataTermino varchar2(10),
	periodo varchar2(8),
	qtdeVagas number(3),
	cpfInstrutor varchar2(11), -- FK
	siglaCurso varchar2(8) not null); -- FK
	
create table tb_AVista(
	codAvista number(10) not null, -- PK 
	valor number(7, 2) not null,
	agencia number(5) not null,
	nCheque number(8) not null,
	preDt varchar2(10) not null);

create table tb_APrazo(
	codAprazo number(10) not null, -- PK
	valor number(7, 2) not null,
	dtVencimento varchar2(10) not null,
	taxaJuros number(5, 2) not null,
	qtdeMensalidade number(3) not null);

create table tb_Matricula(
	cpf varchar2(11) not null, -- PK FK
	dtMatricula varchar2(10),
	siglaTurma varchar2(5) not null, -- FK
	codAvista number(10), -- FK
	codAprazo number(10)); -- FK

-- Constraints

-- Instrutor
alter table tb_Instrutor add constraint PK_Instrutor_cpf primary key (cpf);
alter table tb_Instrutor add constraint CHK_Instrutor_sexo check (sexo in ('M', 'F'));

-- Aluno
alter table tb_Aluno add constraint PK_Aluno_cpf primary key (cpf);
alter table tb_Aluno add constraint CHK_Aluno_sexo check (sexo in ('M', 'F'));

-- Curso
alter table tb_Curso add constraint PK_Curso_sigla primary key (sigla);

-- Turma
alter table tb_Turma add constraint PK_Turma_siglaTurma primary key (siglaTurma);
alter table tb_Turma add constraint FK_Turma_siglaCurso foreign key (siglaCurso) references tb_Curso;
alter table tb_Turma add constraint FK_Turma_cpfInstrutor foreign key (cpfInstrutor) references tb_Instrutor;

-- AVista
alter table tb_AVista add constraint PK_AVista primary key (codAvista);

-- APrazo
alter table tb_APrazo add constraint PK_APrazo primary key (codAprazo);

-- Matricula
alter table tb_Matricula add constraint FK_Matricula_cpf foreign key (cpf) references tb_Aluno;
alter table tb_Matricula add constraint PK_Matricula_cpf primary key (cpf);
alter table tb_Matricula add constraint FK_Matricula_siglaTurma foreign key (siglaTurma) references tb_Turma;
alter table tb_Matricula add constraint FK_Matricula_codAvista foreign key (codAvista) references tb_AVista;
alter table tb_Matricula add constraint FK_Matricula_codAprazo foreign key (codAprazo) references tb_APrazo;

-- Sequences

create sequence seqPK_AVista;
create sequence seqPK_APrazo;