package model;
import java.time.LocalDate;
import java.time.LocalTime;


public class Tarefa {

private int id;
private String tarefa;
private String descricao;
private String status;
private String viewTarefas;
private String viewPesquisar;
private LocalTime horaInicio, horaFim;
private LocalDate dataTarefa;

public String getTarefa(){
    return tarefa;}

public void setTarefa(String tarefa){
    this.tarefa = tarefa;}

public String getDescricao(){
return descricao;}

public void setDescricao(String descricao){
this.descricao = descricao;}

    @Override
    public String toString() {
        return("Tarefa" + tarefa + "Descrição" + descricao);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public LocalTime getHoraInicio(){
        return horaInicio;
    }
    
    public void setHoraInicio(LocalTime horaInicio){
        this.horaInicio = horaInicio;
    }
    
    public LocalTime getHoraFim(){
        
    return horaFim;
    }
    
    public void setHoraFim(LocalTime horaFim){
        this.horaFim = horaFim;
    }
    
    public LocalDate getDataTarefa(){
        return dataTarefa;
    }
    
    public void setDataTarefa(LocalDate dataTarefa){
        this.dataTarefa = dataTarefa;
    }
    public String getStatus (){
        return status;
    }
    
    public void setStatus (String status){
        this.status = status;
    }
    public String getViewTarefas (){
        
    return viewTarefas;
    }
      
    public void setViewTarefas(String viewTarefas){
        this.viewTarefas = viewTarefas;
    }
    
    public String getViewPesquisar() {
        return viewPesquisar;
    }
    
    public void setViewPesquisar(String viewPesquisar) {
        this.viewPesquisar = viewPesquisar;
    }
}
