# Avaliação Java - Spring
Spring: API Rest para Controle de Contatos 
<br/>
## 👩‍💻👨‍💻 Participantes
<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/renan-horochk-de-andrade-943173329/" title="Link para o linkedin">
        <img src="https://avatars.githubusercontent.com/u/178441840?s=400&u=9a2e7c0aeacdd2f593877acc5c1e516a0802eab1&v=4" width="100px;" alt="Foto Perfil Renan Horochk de Andrade"/><br>
        <sub>
          <b>Renan Horochk de Andrade</b>
        </sub>
      </a>
    </td>
    
  </tr>
</table>
<br/>

## ℹ Informações Importantes:
 <br/>
Para contato temos 5 opções:
<br/>
<b>0-</b>TELEFONE<br/>
<b>1-</b>EMAIL<br/>
<b>2-</b>DISCORD<br/>
<b>3-</b>TEAMS<br/>
<b>4-</b>INSTAGRAM<br/>

## 💻 Como utilizar:
<br/>
Para utilizar devemos ter uma IDE para rodar o programa como eclipse,Intellij e etc, após isso entramos no  projeto e Rodamos a aplicação:
<br/>
<b>ENDPOINTS:</b>
<br/>
Endpoints seria o local onde interagimos com o sistema e com o banco temos 4 endpoint:
<br/>
<b>GET:</b>  Ele Retorna um ou diversos dados do banco
<br/>
<b>POST:</b> Ele insere um dado dentro do banco
<br/>
<b>PUT:</b> Ele atualiza um dado dentro do banco
<br/>
<b>DELETE:</b> Ele Deleta um dado dentro do banco
<br/>
<b>Endpoints no programa:</b>
<br/>
<b>1.1.1- Endpoints pessoa</b>
<br/>
<b>POST</b> (Insere uma pessoa ) -http://localhost:8080/api/pessoas
<br/>
<b>GET</b> (Retorna uma pessoa pelo seu id) - http://localhost:8080/api/pessoas/{id}
<br/>
<b>GET</b> (Retorna uma pessoa por mala direta pelo seu id) - http://localhost:8080/api/pessoa/maladireta/{id}
<br/>
<b>GET</b> (Retorna todas pessoas) - http://localhost:8080/api/pessoas  
<br/>
<b>GET</b> (Retorna uma pessoa pelo seu nome) - http://localhost:8080/api/pessoas/fNo/{nome}
<br/>
<b>PUT</b> (Atualiza uma pessoa pelo seu id) - http://localhost:8080/api/pessoas/{id}
<br/>
<b>DELETE</b> (Deleta uma pessoa pelo seu id) - http://localhost:8080/api/pessoas/{id}
<br/>
<b>1.1.2- Endpoints Contato:</b><br/>
 <b>POST</b> (Insere um contato para uma pessoa ) - http://localhost:8080/api/contato 
 <br/>
 <b>GET</b> (Retorna um contato pelo seu id) -  http://localhost:8080/api/contato/{id}
 <br/>
 <b>GET</b> (Retorna todos contato pelo id de uma pessoa ) - http://localhost:8080/api/contato/pessoa/2 
 <br/>
 <b>PUT</b> (Atualiza um contato pelo seu id ) - http://localhost:8080/api/contato/{id}
 <br/>
 <b>DELETE</b> (Deleta um contato pelo seu id ) - http://localhost:8080/api/contato/{id}
 <br/>


<b>Utilização do programa</b>
<br/>
<b>1.2.1-Postman/Insomnia</b> 
<br/>
Para utilizar por meio de um dos programas devemos baixa-los: 
<br/>
Postman:https://www.postman.com/downloads/  
Insomnia:https://insomnia.rest/download 
<br/>
Usaremos o Postman de exemplo, teremos como inicio está tela: <br/>
![image](https://github.com/user-attachments/assets/334f17dd-f533-45f7-b066-ffbf2a77fd7a)
Nisso criamos uma coleção em new collection: <br/>
![image](https://github.com/user-attachments/assets/b9be420f-fca4-4a95-bcb2-632cd9612895)<br/>
Nisso criamos uma nova request dentro dessa collection: <br/>
![image](https://github.com/user-attachments/assets/4d23c1fa-b8cb-400a-9c37-485266618c6c)
<br/>
com isso utilizamos os endpoints criados:
<b>POST</b> (Insere uma pessoa )-http://localhost:8080/api/pessoas <br/> então clicamos em body e após isso em raw e adicionamos os campos e os dados a serem inseridos para todos os casos usamos o send para enviar <br/>
![image](https://github.com/user-attachments/assets/d2179c72-ab26-49f4-a7b2-d073359661bc)
<br/>
<b>GET</b> (Retorna uma pessoa pelo seu id) - http://localhost:8080/api/pessoas/{id} <br/> apenas adicionamos o id no final do endpoint no lugar de {id} a ser pesquisado <br/>
![image](https://github.com/user-attachments/assets/a345d34c-a3ce-496d-8396-384a13adff2e)
<br/>
<b>GET</b> (Retorna uma pessoa por mala direta pelo seu id) - http://localhost:8080/api/pessoa/maladireta/{id} <br/> apenas adicionamos o id no final do endpoint no lugar de {id} a ser pesquisado <br/>
![image](https://github.com/user-attachments/assets/63e75ca5-650e-43f4-bee5-21ba285bb9a2)
<br/>
<b>GET</b> (Retorna todas pessoas) - http://localhost:8080/api/pessoas  <br/> apenas clicamos em send e ira retornar todos <br/>
![image](https://github.com/user-attachments/assets/30655ec7-4805-454e-9465-c41d0b368dd5)
<br/>
<b>GET</b> (Retorna uma pessoa pelo seu nome) - http://localhost:8080/api/pessoas/fNo/{nome} <br/> apenas adicionamos o nome no final do endpoint no lugar de {nome} a ser pesquisado <br/>
![image](https://github.com/user-attachments/assets/ea3cbbaa-c2fe-46ea-a1c4-b46c80ee9c9f)
<br/>
<b>PUT</b> (Atualiza uma pessoa pelo seu id) - http://localhost:8080/api/pessoas/{id} <br/> apenas adicionamos o id no final do endpoint no lugar de {id} a ser atualizado e clicamos em body e depois em raw e adicionamos os dados a serem utilizados
<br/>
![image](https://github.com/user-attachments/assets/82a00d0a-6819-4eb5-8145-f9d26078554f)
<br/>
<b>DELETE</b> (Deleta uma pessoa pelo seu id) - http://localhost:8080/api/pessoas/{id}<br/>  apenas adicionamos o id no final do endpoint no lugar de {id} a ser deletado
<br/>
![image](https://github.com/user-attachments/assets/562fc3db-b5fe-4cd7-939a-a02c85107d9b)
<br/>

<br/>
 <b>POST</b> (Insere um contato para uma pessoa ) - http://localhost:8080/api/contato <br/> Assim como o de pessoa, clicamos em body e após isso em raw e adicionamos os campos e os dados a serem inseridos para todos os casos usamos o send para enviar
 <br/>
 
 ![image](https://github.com/user-attachments/assets/ad16e57d-deb2-4ef8-bb5d-83d42c04122d)
 
 <br/>
 <b>GET</b> (Retorna um contato pelo seu id) -  http://localhost:8080/api/contato/{id}<br/> apenas adicionamos o id no final do endpoint no lugar de {id} a ser pesquisado 
 <br/>
 
 ![image](https://github.com/user-attachments/assets/966c96d4-c8c5-4d21-b89d-b0cfc8fc9c90)
 
 <br/>
 <b>GET</b> (Retorna todos contato pelo id de uma pessoa ) - http://localhost:8080/api/contato/pessoa/2 <br/> apenas adicionamos o id da pessoa no final do endpoint no lugar de {id} a ser pesquisado e então teremos todos contatos de uma pessoa 
 <br/>
 
 ![image](https://github.com/user-attachments/assets/1a95269a-b002-4a8c-9322-449016bade49)
 
 <br/>
 <b>PUT</b> (Atualiza um contato pelo seu id ) - http://localhost:8080/api/contato/{id}<br/>  apenas adicionamos o id no final do endpoint no lugar de {id} a ser atualizado e clicamos em body e depois em raw e adicionamos os dados a serem utilizados
 <br/>
 
 ![image](https://github.com/user-attachments/assets/96a86470-70dc-480d-bb34-53f0b21d7322)
 
 <br/>
 <b>DELETE</b> (Deleta um contato pelo seu id ) - http://localhost:8080/api/contato/{id}<br/> apenas adicionamos o id no final do endpoint no lugar de {id} a ser deletado e enviamos e assim ele está deletado
 <br/>
 
 ![image](https://github.com/user-attachments/assets/cb250c5e-2dd2-4798-99e0-97f73d08ba94)
 
 <br/>

<b>1.2.2-Swagger-ui</b>  <br/>
Para utilizarmos o swagger-ui entramos no link : http://localhost:8080/swagger-ui/index.html#/  <br/> ![image](https://github.com/user-attachments/assets/fde4467a-63b2-4907-a165-0e19ed05804a) <br/>
Nisso temos dois resouces para utilizarmos sendo os endpoint de contato e pessoa sendo iguais ao do postman tendo algumas mudanças
<br/>
<b>POST</b> (Insere uma pessoa )-/api/pessoas  <br/>  então acessamos e vamos em POST e clicamos em try it out e adicionamos as informações e enviamos <br/>
![image](https://github.com/user-attachments/assets/84f2eab2-75e6-4caa-b5eb-56ece91c042a)

<br/>
<b>GET</b> (Retorna uma pessoa pelo seu id) - /api/pessoas/{id} <br/> acessmos o site e vamos a opção de get by id <br/>

![image](https://github.com/user-attachments/assets/c22c0ef3-14f2-4361-aabe-755fa55697f0)

<br/> apos isso clicamos em try it out e adicionamos o parametro(id) e clicamos em execute <br/>

![image](https://github.com/user-attachments/assets/813a0fe2-e90a-4c9c-93c8-df2ae7693803)

<br/>
<b>GET</b> (Retorna uma pessoa por mala direta pelo seu id) - /api/pessoa/maladireta/{id} <br/> apenas adicionamos o id no parametro e clicamos em try it out e execute a ser pesquisado <br/>

![image](https://github.com/user-attachments/assets/b7a36668-2dc2-4f12-9bd9-1c31200e9ef2)

<br/>
<b>GET</b> (Retorna todas pessoas) - /api/pessoas  <br/> apenas clicamos em try it out e execute e ele irá retornar todos <br/>
![image](https://github.com/user-attachments/assets/d1e32588-80b3-4e84-902d-03073cb38026)
<br/>
<b>GET</b> (Retorna uma pessoa pelo seu nome) - /api/pessoas/fNo/{nome} <br/> apenas adicionamos o nome no parametro e clicamos em try it out e execute a ser pesquisado <br/>
![image](https://github.com/user-attachments/assets/ff2030b7-8b7f-4d0d-9bf6-da8056300b25)

<br/>
<b>PUT</b> (Atualiza uma pessoa pelo seu id) - /api/pessoas/{id} <br/> Clicamos em try it out, adicionamos os dados a serem utilizados , e clicamos execute para atualizar
<br/>
![image](https://github.com/user-attachments/assets/758723d0-8a22-4f2d-9136-cfccfa0f8cee)

<br/>
<b>DELETE</b> (Deleta uma pessoa pelo seu id) - /api/pessoas/{id}<br/> Adicionamos o id no parametro e clicamos em try it out e execute para que seja deletado
<br/>

![image](https://github.com/user-attachments/assets/7af7fe2b-83b8-4dc5-b288-c3d55af6ce3d)

<br/>

<br/>
 <b>POST</b> (Insere um contato para uma pessoa ) - /api/contato <br/> Assim como o de pessoa, então acessamos e vamos em POST e clicamos em try it out e adicionamos as informações e enviamos
 <br/>
 
 ![image](https://github.com/user-attachments/assets/f8e0c26e-b57c-45e6-9bed-9ab78938adde)
 
 <br/>
 <b>GET</b> (Retorna um contato pelo seu id) -  /api/contato/{id}<br/> Apenas adicionamos o id no parametro e clicamos em try it out e execute para que seja pesquisado
 <br/>
 
![image](https://github.com/user-attachments/assets/f1d52ce5-b874-4597-9e8b-3d6e345b4afe)

 <br/>
 <b>GET</b> (Retorna todos contato pelo id de uma pessoa ) - /api/contato/pessoa/{id] <br/> Adicionamos o id da pessoa que queremos buscar no parametro e clicamos em try it out e execute para que seja pesquisado todos os contatos da pessoa
 <br/>
 
![image](https://github.com/user-attachments/assets/1555099c-0b7a-4d97-ad19-a6a591736ea8)

 <br/>
 <b>PUT</b> (Atualiza um contato pelo seu id ) - /api/contato/{id}<br/>  Clicamos em try it out, ddicionamos o as informações e o id que queremos atualizar no body e clicamos em execute para que seja atualizado
 <br/>
 
![image](https://github.com/user-attachments/assets/29f53666-dce5-409b-99dc-5ce68d7e36ed)

 <br/>
 <b>DELETE</b> (Deleta um contato pelo seu id ) - /api/contato/{id}<br/> Apenas adicionamos o id no parametro e clicamos em try it out e execute para que seja deletado
 <br/>
 
![image](https://github.com/user-attachments/assets/8ec0cbc4-c30a-47bb-a52f-abf82ff61411)

 <br/>

 
<br/>


