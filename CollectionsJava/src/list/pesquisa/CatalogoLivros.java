package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        this.listaLivros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> buscarPorAutor(String autor){
        List<Livro> listaPorAutor = new ArrayList<>();
        
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listaPorAutor.add(l);
                }    
            }
        }
        
        return listaPorAutor;
    }
    
    public List<Livro> buscarPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<Livro> listaPorAno = new ArrayList<>();
        
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaPorAno.add(l);
                }    
            }
        }

        return listaPorAno;
    }
    
    public Livro buscarPorTitulo(String titulo){
        Livro livro = null;

        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                    livro = l;
                    break;    
                }
            }
        }

        return livro;
    }
 
    public List<Livro> buscarTodosPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = new ArrayList<>();

        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                    livrosPorTitulo.add(l);
                }
            }
        }

        return livrosPorTitulo;
    }


    
    public void obterLivros(){
        System.out.println(listaLivros);
    }
}
