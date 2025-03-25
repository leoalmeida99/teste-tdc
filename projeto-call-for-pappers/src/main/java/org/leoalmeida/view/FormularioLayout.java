package org.leoalmeida.view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "submit", layout = MainLayout.class)
@PageTitle("Submissão de Palestras")
public class FormularioLayout extends VerticalLayout {

    private final TextField title = new TextField("Título");
    private final TextArea summary = new TextArea("Resumo");
    private final TextField authorName = new TextField("Nome do Autor");
    private final EmailField email = new EmailField("E-mail");

    private final Button save = new Button("Enviar");
    private final Button cancel = new Button("Limpar");

    public FormularioLayout() {
        addClassName("submission-form-view");
        setSizeFull();
        
        add(
            createTitle(),
            createFormLayout(),
            createButtonLayout()
        );
    }

    private Component createTitle() {
        H2 title = new H2("Submeta sua proposta de palestra");
        title.addClassName("form-title");
        return title;
    }

   private Component createFormLayout() {
        FormLayout formLayout = new FormLayout();
        
        title.setRequired(true);
        summary.setRequired(true);
        authorName.setRequired(true);
        email.setRequired(true);
        
        summary.setMinHeight("150px");
        
        formLayout.add(title, summary, authorName, email);
        formLayout.setColspan(summary, 2);
        formLayout.setMaxWidth("500px");
        formLayout.setResponsiveSteps(
            new FormLayout.ResponsiveStep("0", 1),
            new FormLayout.ResponsiveStep("500px", 2)
        );
        
        return formLayout;
    }

    private Component createButtonLayout() {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.addClassName("button-layout");
        
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        
        buttonLayout.add(save, cancel);
        return buttonLayout;
    }

}