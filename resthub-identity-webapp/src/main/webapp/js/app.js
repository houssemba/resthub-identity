define([ 'jquery', 'backbone', 'router/app-router', 'hbs!../../template/main', 'i18n!nls/labels', 'bootstrap', 'jquery-ui', 'hbs!../../template/accessdenied' ]
    , function ($, Backbone, AppRouter, mainTemplate, labels, BootStrap, Ui,AccessDeniedTemplate) {

        // Envoie les logs côté serveur
        console.level = 'debug';

        $("body").html(mainTemplate({
            labels: labels
        }));

        $.ajaxSetup({
            cache: false,
            statusCode: {
                403: function () {
                    $("#main").html(AccessDeniedTemplate());
                }
            }
        });

        new AppRouter;
        Backbone.history.start();

    });