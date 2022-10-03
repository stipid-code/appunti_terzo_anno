S <- c(19.5, 28.4, 16.2, 24.0, 31.4, 24.2)
E <- c(  15,   18,   16,   14,   18,   19)
F <- c( "N",  "C",  "N",  "S",  "N",  "C")

class(S)
class(E)
class(F)

# Costruzione alternativa della matrice dei dati

x <- cbind(S,E,F) #cbind, c -> colonne
y <- rbind(S,E,F) #rbind, r -> righe

# Raggruppa oggetti diversi all'interno della stessa struttura
# Data frame, e list
# Data frame puoi metterci oggetti solo dello stesso tipo, data list cazzo che vuoi

(x_dF <- data.frame(S,E,F))

nbin <- 4
bufsize <- (max(x_dF$S)-min(x_dF$S))/nbin

makebreak <- function(xx, n_breaks) {
    binsize <- (max(xx)-min(xx))/n_breaks
    brea <- matrix(0,nrow=(n_breaks+1),ncol=all)
    brea
}




















