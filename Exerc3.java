#include <iostream>

using namespace std;

class Aluno{
    string nome;
    int periodo;
    double coef;
public:
    Aluno(string novo_aluno){
        nome = novo_aluno;
        cout<<"Aluno criado"<<endl;
    }
    Aluno(string novo_aluno, int novo_periodo, int novo_coef){
        nome = novo_aluno;
        periodo = novo_periodo;
        coef = novo_coef;
        cout<<"Aluno criado"<<endl;
    }
    ~Aluno(){
        cout<<"Aluno Destruido"<<endl;
    }
    void inserePeriodo(int novo_periodo){
        periodo = novo_periodo;
        cout<<"Periodo adicionado"<<endl;
    }
    void insereCoef(double novo_coef){
        coef = novo_coef;
        cout<<"Coeficiente adicionado"<<endl;
    }
    void ImprimeDados(){
        cout<<""<<nome;
        cout<<""<<periodo;
        cout<<""<<coef<<endl;
    }
};
int main()
{
    string nome;
    int periodo;
    double coef;
    Aluno** alunos;

    alunos=new Aluno*[2];

    cout<<"Digite o nome do aluno, o periodo em que ele se encontra e seu coef."<<endl;
    cin>>nome>>periodo>>coef;

    alunos[0]=new Aluno(nome);
    alunos[0]->insereCoef(coef);
    alunos[0]->inserePeriodo(periodo);

    alunos[1]=new Aluno(nome,periodo,coef);

    alunos[0]->ImprimeDados();
    alunos[1]->ImprimeDados();

    for(int i=0;i<2;i++)
        delete alunos[i];
    delete alunos;

    return 0;
    }
