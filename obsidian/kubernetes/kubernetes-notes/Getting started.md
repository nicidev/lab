## Set-up autocompletion in zsh terminal
Autocompletion:

`source <(kubectl completion zsh)`

When `command not found: compdef`error occurs: 

`autoload -Uz compinit
`compinit`

Alias: 
To begin, navigate to the `~/.zshrc` file. This file serves as the configuration file for the Zsh shell, allowing you to customize its behavior and add personalizations.

`alias k="kubectl"

Once you've defined your desired aliases, it's essential to inform Zsh to re-initialize itself with the updated `~/.zshrc` file. This ensures that your new aliases come into effect. To achieve this, execute the following command in your terminal:

`source ~/.zshrc
`