

$(document).ready(function () {
    listaUsuarios();

    
    

});

function listaUsuarios(){

    $('#id')[0].disabled = true;

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/users/listarTodosUsuarios",
        success: function (response) {
            $('#listaUsuarios > tbody > tr').remove();
            for (var i = 0; i < response.length; i++) {

                let options = {
                    timeZone: 'America/Sao_Paulo', // Lista de Timezones no fim do artigo
                    hour12: true, // Alterna entre a mostragem dos horários em 24 horas, ou então AM/PM
                }
                if (response[i].ativo == true) {
                    response[i].ativo = 'Sim';
                } else {
                    response[i].ativo = 'Não'
                }
                
                $('#listaUsuarios > tbody').append(
                    '<tr><td>' + response[i].id + 
                    '</td><td>' + response[i].login + 
                    '</td><td>' + response[i].nome + 
                    '</td><td>' + response[i].ativo + 
                    '</td><td>' + new Date(response[i].dataCadastro).toLocaleDateString('pt-BR', options) + 
                    '</td><td><button type="button" class="btn btn-primary" id="btnEditP" data-toggle="modal" data-target="#modalPermission">Editar permissões</button></td></tr>');
            }

            $('#btnEditP').click(function () {
                console.log('Clicou')
                $('#modalPermission').modal('show');
            })
        }
    }).fail(function (xhr) {
        alert('Erro ao listar os usuários do sistema' + xhr.responseText);
    });

}

$('#form_save_users').on('submit', function (event) {
    event.preventDefault();

    let id = "";
    let nome = $("input[name='nome']").val();
    let login = $("input[name='login']").val();
    let senha = $("input[name='senha']").val();
    let ativo = $("input:radio[name='ativo']:checked").val();


    let data = { id, nome, login, senha, ativo };

    $.post("http://localhost:8080/users/saveUsers", data, function (response) {
        console.log(response);
        

        $('#form_save_users').each(function () {
            this.reset();
        });
        
        toastr.options = {
        "closeButton": true,
        "debug": true,
        "newestOnTop": false,
        "progressBar": true,
        "positionClass": "toast-top-right",
        "preventDuplicates": false,
        "showDuration": "300",
        "hideDuration": "1000000",
        "timeOut": "5000",
        "extendedTimeOut": "1000",
        "showEasing": "swing",
        "hideEasing": "linear",
        "showMethod": "fadeIn",
        "hideMethod": "fadeOut"
    }
    toastr["success"]("Usuario " + nome + " criado com sucesso!", "Sucesso");

    listaUsuarios();

    }).fail(function (xhr) {
        toastr.error('Não foi possível criar o usuário' + xhr.responseText);
    });
});

function msg_success() {

    toastr.options = {
        "closeButton": true,
        "debug": true,
        "newestOnTop": false,
        "progressBar": true,
        "positionClass": "toast-top-right",
        "preventDuplicates": false,
        "showDuration": "300",
        "hideDuration": "1000000",
        "timeOut": "5000",
        "extendedTimeOut": "1000",
        "showEasing": "swing",
        "hideEasing": "linear",
        "showMethod": "fadeIn",
        "hideMethod": "fadeOut"
    }
    toastr["success"]("Thanks for your support", "Hello BBBootstrap");



   function listaPermissoes(){

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/users/listaPermissao"
    })


   }

}