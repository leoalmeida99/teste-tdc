package org.leoalmeida.view;

import org.leoalmeida.form.Formulario;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.Route;

@Route("submissoes")
public class SubmissoesLayout extends AppLayout {

    public SubmissoesLayout() {
        setContent(createGridFormulario());
    }

    private Component createGridFormulario() {
        Grid<Formulario> grid = new Grid<>(Formulario.class, true);
        grid.addColumn(Formulario::getAuthorName).setHeader("Nome");

        grid.setItems(Formulario.listAll());
        return grid;
    }

}