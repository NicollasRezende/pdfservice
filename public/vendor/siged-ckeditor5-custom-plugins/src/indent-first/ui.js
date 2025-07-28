/**
 * @module indent-first/ui
 */

import { Plugin } from 'ckeditor5';
import { ButtonView } from 'ckeditor5';
import { ATTRIBUTE } from './index.js';

export class IndentFirstUi extends Plugin {
	/**
	 * @inheritDoc
	 */
	static get pluginName() {
		return 'IndentFirstUI';
	}

	/**
	 * @inheritDoc
	 */
	init() {
		const editor = this.editor;

		editor.ui.componentFactory.add(ATTRIBUTE, (locale) => {
			const command = editor.commands.get(ATTRIBUTE);
			const buttonView = new ButtonView(locale);

			buttonView.set({
				label: 'Parágrafo',
				icon: null,
				tooltip: true,
				isToggleable: true,
			});

			buttonView.bind('isOn', 'isEnabled').to(command, 'value', 'isEnabled');

			// Execute command.
			this.listenTo(buttonView, 'execute', () => {
				editor.execute(ATTRIBUTE);
				editor.editing.view.focus();
			});

			return buttonView;
		});
	}
}
