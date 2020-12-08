<h2>Integrantes do grupo</h2>
<ul>
    <li>Augusto Vesco Raveli</li>
    <li>Lucas de Souza Bocalini</li>
    <li>Samuel Marques dos Santos</li>
</ul>

<h2 style={{fontSize: 20, fontWeight: 'bold'}}>Guia de utilização:</h2>

<p>1 - Clonar/baixar o repositório</p>
<p>2 - Abrir o projeto na IDE</p>
<p>3 - Esperar os pacotes serem baixados (pode demorar alguns minutos)</p>
<p>4 - Executar o arquivo main (SpringbootBackendApplication) </p>
<p>5 - Acessar as urls abaixo para consultar os dados da api:</p>
<ul>
    <li>http://localhost:8080/api/users</li>
    <li>http://localhost:8080/api/cases</li>
    <li>http://localhost:8080/api/preventions</li>
    <li>http://localhost:8080/api/news</li>
    <li>http://localhost:8080/api/newsletter/1</li>
</ul>

##Caso nao estiver carregando os dados do front é porque a api está apontando para outra porta, nos controllers a api está observando a porta 3002, como no código a seguir:

@CrossOrigin(origins = "http://localhost:3002")

Para testar o front, trocar o numero para a porta que a sua aplicação está rodando (por padrão é a porta 3000, portanto http://localhost:3000). Fazer isso em todos os arquivos controllers.
