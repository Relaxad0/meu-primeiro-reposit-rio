estoque = {}
estoque_minimo = 5

def menu():
    while True:
        print("\n--- MENU PRINCIPAL ---")
        print("1. Cadastro de Produto")
        print("2. Remover Produto")
        print("3. Editar Produto")
        print("4. Entrada de Estoque")
        print("5. Saída de Estoque")
        print("6. Consultar Produto")
        print("7. Relatório Geral")
        print("8. Relatório de Baixo Estoque")
        print("9. Sair")

        escolha = input("Escolha uma opção: ")

        if escolha == '1':
            cadastrar_produto()
        elif escolha == '2':
            remover_produto()
        elif escolha == '3':
            editar_produto()
        elif escolha == '4':
            entrada_estoque()
        elif escolha == '5':
            saida_estoque()
        elif escolha == '6':
            consultar_produto()
        elif escolha == '7':
            relatorio_geral()
        elif escolha == '8':
            relatorio_baixo_estoque()
        elif escolha == '9':
            print("Saindo do sistema...")
            break
        else:
            print("Opção inválida! Tente novamente.")

def cadastrar_produto():
    try:
        id = input("ID do Produto: ")
        if id in estoque:
            print("Produto já cadastrado.")
            return
        nome = input("Nome: ")
        categoria = input("Categoria: ")
        quantidade = int(input("Quantidade em Estoque: "))
        preco = float(input("Preço: R$ "))
        estoque[id] = {
            "nome": nome,
            "categoria": categoria,
            "quantidade": quantidade,
            "preco": preco
        }
        print("Produto cadastrado com sucesso.")
    except:
        print("Erro nos dados. Tente novamente.")

def remover_produto():
    id = input("Informe o ID do produto a ser removido: ")
    if id in estoque:
        del estoque[id]
        print("Produto removido com sucesso.")
    else:
        print("Produto não encontrado.")

def editar_produto():
    id = input("ID do Produto para editar: ")
    if id in estoque:
        print("Produto atual:", estoque[id])
        nome = input("Novo nome (ou Enter para manter): ")
        categoria = input("Nova categoria (ou Enter para manter): ")
        try:
            quantidade = input("Nova quantidade (ou Enter para manter): ")
            preco = input("Novo preço (ou Enter para manter): ")

            if nome:
                estoque[id]["nome"] = nome
            if categoria:
                estoque[id]["categoria"] = categoria
            if quantidade:
                estoque[id]["quantidade"] = int(quantidade)
            if preco:
                estoque[id]["preco"] = float(preco)

            print("Produto atualizado.")
        except:
            print("Erro nos dados. Edição cancelada.")
    else:
        print("Produto não encontrado.")

def entrada_estoque():
    id = input("ID do Produto: ")
    if id in estoque:
        try:
            qtd = int(input("Quantidade a adicionar: "))
            estoque[id]["quantidade"] += qtd
            print("Entrada registrada.")
        except:
            print("Quantidade inválida.")
    else:
        print("Produto não encontrado.")

def saida_estoque():
    id = input("ID do Produto: ")
    if id in estoque:
        try:
            qtd = int(input("Quantidade a remover: "))
            if qtd > estoque[id]["quantidade"]:
                print("Estoque insuficiente.")
            else:
                estoque[id]["quantidade"] -= qtd
                print("Saída registrada.")
        except:
            print("Quantidade inválida.")
    else:
        print("Produto não encontrado.")

def consultar_produto():
    busca = input("Buscar por ID, nome ou categoria: ").lower()
    encontrados = []
    for id, dados in estoque.items():
        if (busca in id.lower() or
            busca in dados["nome"].lower() or
            busca in dados["categoria"].lower()):
            encontrados.append((id, dados))
    if encontrados:
        for id, dados in encontrados:
            print(f"\nID: {id}")
            print(f"Nome: {dados['nome']}")
            print(f"Categoria: {dados['categoria']}")
            print(f"Quantidade: {dados['quantidade']}")
            print(f"Preço: R$ {dados['preco']:.2f}")
    else:
        print("Nenhum produto encontrado.")

def relatorio_geral():
    if estoque:
        print("\n--- RELATÓRIO DE ESTOQUE ---")
        for id, dados in estoque.items():
            print(f"\nID: {id} | Nome: {dados['nome']} | Categoria: {dados['categoria']} | Qtd: {dados['quantidade']} | Preço: R$ {dados['preco']:.2f}")
    else:
        print("Estoque vazio.")

def relatorio_baixo_estoque():
    alerta = False
    print("\n--- PRODUTOS COM BAIXO ESTOQUE ---")
    for id, dados in estoque.items():
        if dados["quantidade"] <= estoque_minimo:
            alerta = True
            print(f"ID: {id} | Nome: {dados['nome']} | Qtd: {dados['quantidade']}")
    if not alerta:
        print("Nenhum produto com baixo estoque.")
menu()