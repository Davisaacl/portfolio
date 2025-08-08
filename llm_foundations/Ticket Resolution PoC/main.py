from langgraph.graph import StateGraph, END
from utils.ticket_state import TicketState
from agents.orchestrator_agent import orchestrator_agent
from agents.resolver_agent import resolver_agent
from agents.knowledge_agent import knowledge_agent

# Estado inicial
initial_state = TicketState(
    ticket_id="TCKT-001",
    context={"issue_summary": "User cannot access VPN"}
)

# Crear grafo
graph = StateGraph(TicketState)

# Nodos
graph.add_node("orchestrator", orchestrator_agent)
graph.add_node("resolver", resolver_agent)
graph.add_node("knowledge", knowledge_agent)

# Entrada
graph.set_entry_point("orchestrator")

# Decidir próximo paso desde el orquestador
def next_step(state: TicketState) -> str:
    if state.status == "planning":
        return "knowledge"
    elif state.status == "resolving":
        return "resolver"
    elif state.status == "resolved":
        return END
    return "orchestrator"

graph.add_conditional_edges("orchestrator", next_step)

# Conectar knowledge → resolver
graph.add_edge("knowledge", "resolver")

# resolver → orquestador para cerrar el ciclo
graph.add_edge("resolver", "orchestrator")

# Compilar
app = graph.compile()

# Ejecutar
final_state = app.invoke(initial_state)

# Mostrar resultado
print("\n📝 Final Ticket State:\n", final_state)
