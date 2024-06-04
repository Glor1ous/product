package com.example.application.views.онас;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("О нас")
@Route(value = "my-view", layout = MainLayout.class)
public class ОнасView extends Composite<VerticalLayout> {

    public ОнасView() {
        H1 h1 = new H1();
        Hr hr = new Hr();
        H2 h2 = new H2();
        H3 h3 = new H3();
        Hr hr2 = new Hr();
        H2 h22 = new H2();
        H3 h32 = new H3();
        Hr hr3 = new Hr();
        H2 h23 = new H2();
        H3 h33 = new H3();
        Hr hr4 = new Hr();
        H2 h24 = new H2();
        getContent().setWidth("100%");
        getContent().setHeight("1400px");
        h1.setText("CodeRu");
        h1.setWidth("max-content");
        h2.setText("О нашей школе:");
        h2.setWidth("max-content");
        h3.setText(
                "? CodeRu – это современная онлайн школа программирования, основанная в 2020 году с целью предоставления качественного и доступного образования в сфере IT. Мы верим, что каждый может стать программистом, если у него есть доступ к правильным ресурсам и поддержке.\r\n\r\nНаши курсы разработаны для людей с разным уровнем подготовки – от новичков до продвинутых пользователей. В нашем арсенале есть курсы по различным языкам программирования, инструментам и технологиям, которые востребованы на рынке труда.");
        h3.setWidth("100%");
        h22.setText("Наша миссия:");
        h22.setWidth("max-content");
        h32.setText(
                "?  Наша миссия – помочь вам достигнуть ваших карьерных целей в сфере IT. Мы стремимся создать такие условия обучения, которые позволят вам получить не только теоретические знания, но и практические навыки, необходимые для успешной работы в индустрии.");
        h32.setWidth("100%");
        h23.setText("Наша команда:");
        h23.setWidth("max-content");
        h33.setText(
                "? Мы гордимся нашей командой преподавателей, которые имеют богатый опыт работы в IT и страсть к обучению. Каждый из наших преподавателей является экспертом в своей области и готов поделиться своими знаниями и опытом с вами.");
        h33.setWidth("100%");
        h24.setText("Обучайтесь вместе с CodeRu, открывая новые горизонты!");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h24);
        h24.setWidth("max-content");
        getContent().add(h1);
        getContent().add(hr);
        getContent().add(h2);
        getContent().add(h3);
        getContent().add(hr2);
        getContent().add(h22);
        getContent().add(h32);
        getContent().add(hr3);
        getContent().add(h23);
        getContent().add(h33);
        getContent().add(hr4);
        getContent().add(h24);
    }
}
